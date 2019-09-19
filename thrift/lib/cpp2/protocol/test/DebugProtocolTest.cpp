/*
 * Copyright 2017-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
#include <folly/portability/GTest.h>

#include <thrift/lib/cpp2/protocol/DebugProtocol.h>
#include <thrift/lib/cpp2/protocol/test/gen-cpp2/Module_types.h>
#include <thrift/lib/cpp2/protocol/test/gen-cpp2/Module_types_custom_protocol.h>

namespace apache::thrift::protocol {

using namespace test;

template <class Set>
void factor(int64_t n, Set& factors) {
  for (int64_t d = 1; d * d <= n; ++d) {
    auto div = std::div(n, d);
    if (div.rem == 0) {
      factors.insert(d);
      factors.insert(div.quot);
    }
  }
}

TEST(DebugProtocolTest, Containers) {
  DebugSortedAssociative sorted;
  DebugHashedAssociative hashed;
  for (int64_t n = 1; n < 50; ++n) {
    factor(n, sorted.value[n]);
    factor(n, hashed.value[n]);
  }
  auto debugHashed = debugString(hashed);
  auto debugSorted = debugString(sorted);
  folly::StringPiece bodyHashed = debugHashed;
  folly::StringPiece bodySorted = debugSorted;
  bodyHashed.split_step('\n');
  bodySorted.split_step('\n');
  EXPECT_EQ(bodyHashed.str(), bodySorted.str());
}

} // namespace apache::thrift::protocol
