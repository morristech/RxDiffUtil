/*
 * MIT License
 *
 * Copyright (c) 2017 Stan Mots (Storix)
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

package com.stolets.rxdiffutil;

import android.app.Activity;
import android.support.v7.util.DiffUtil;

import com.stolets.rxdiffutil.diffrequest.DiffRequestBuilder;

import org.junit.Test;
import org.mockito.Mock;

import static net.trajano.commons.testing.UtilityClassTestUtil.assertUtilityClassWellDefined;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

public class RxDiffUtilTest extends BaseTest {
    @Mock
    Activity mActivity;

    @Mock
    DiffUtil.Callback mCallback;

    @Test
    public void it_IsUtilityClass() throws Exception {
        assertUtilityClassWellDefined(RxDiffUtil.class);
    }

    @Test
    public void builder_ReturnsNotNullDiffRequestBuilder() {
        // Given an activity and a callback

        // When
        final DiffRequestBuilder builder = RxDiffUtil.with(mCallback);

        // Then
        assertThat(builder, notNullValue());
    }
}
