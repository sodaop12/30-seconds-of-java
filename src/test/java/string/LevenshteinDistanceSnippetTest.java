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

package string;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/*
 * Tests for 30 Seconds of Java code library
 *
 */
class LevenshteinDistanceSnippetTest {
  /**
   * Tests for {@link LevenshteinDistanceSnippet#findLevenshteinDistance(String, String)}.
   */
  @Test
  void testFindLevenshteinDistance() {
    assertThrows(IllegalStateException.class, () -> {
      new LevenshteinDistanceSnippet();
    });
    assertEquals(3, LevenshteinDistanceSnippet.findLevenshteinDistance("kitten", "kit"));
    assertEquals(6, LevenshteinDistanceSnippet.findLevenshteinDistance("kitten", ""));
    assertEquals(7, LevenshteinDistanceSnippet.findLevenshteinDistance("", "sitting"));
    assertEquals(3, LevenshteinDistanceSnippet.findLevenshteinDistance("kitten", "sitting"));
    assertEquals(5, LevenshteinDistanceSnippet.findLevenshteinDistance("intention", "execution"));
    assertEquals(10, LevenshteinDistanceSnippet
            .findLevenshteinDistance("zoologicoarchaeologist", "zoogeologist"));
  }
}