/*
 * MIT License
 *
 * Copyright (c) 2017-2022 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/*
 * Tests for 30 Seconds of Java code library
 *
 */
class LinearSearchSnippetTest {

  /**
     * Tests for {@link LinearSearchSnippet#linearSearch(int[], int)}.
   */

  @Test
  void testLinearSearch() {
    assertThrows(IllegalStateException.class, () -> {
      new LinearSearchSnippet();
    });
    int[] arr = new int[]{220, 33, 11, 4, 45, 1, 8, 5, 7, 23, 8, 56, 3, 12};
    assertEquals(7, LinearSearchSnippet.linearSearch(arr, 5));

    int[] arr2 = new int[]{1, 6, 4, 8, 4, 8, 9, 0, 1, 55, 1};
    assertEquals(3, LinearSearchSnippet.linearSearch(arr2, 8));

    int[] arr3 = new int[]{4, 9, 1, 7, 33, 100, 11, 106};
    assertEquals(-1, LinearSearchSnippet.linearSearch(arr3, 6));
  }

}
