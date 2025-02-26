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
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/*
 * Tests for 30 Seconds of Java code library
 *
 */
class CountingSortSnippetTest {
  /**
   * Tests for {@link CountingSortSnippet#countingSort(int[])}.
   */
  @Test
  void testCountingSort() {
    var arr = new int[] {6, 3, 1, 5, 4, 2};
    CountingSortSnippet.countingSort(arr);
    assertEquals(6, arr.length);
    assertEquals(1, arr[0]);
    assertEquals(2, arr[1]);
    assertEquals(3, arr[2]);
    assertEquals(4, arr[3]);
    assertEquals(5, arr[4]);
    assertEquals(6, arr[5]);

    assertThrows(IllegalStateException.class, () -> {
      new CountingSortSnippet();
    });

    assertNotEquals(7, arr.length);
    assertNotEquals(2, arr[0]);
    assertNotEquals(3, arr[1]);
    assertNotEquals(4, arr[2]);
    assertNotEquals(5, arr[3]);
    assertNotEquals(6, arr[4]);
    assertNotEquals(7, arr[5]);
  }
}
