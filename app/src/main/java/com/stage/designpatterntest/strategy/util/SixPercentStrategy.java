
package com.stage.designpatterntest.strategy.util;

import android.util.Log;

/**
 * @author dengzi
 * @Date 2014-12-9 下午3:52:12 
 * @Version V1.0
 * @Description 实现算法接口，商品 打6折
 * @Change
 */
public class SixPercentStrategy implements PriceStrategy{

	@Override
	public int setPrice(int orgPrice) {
		Log.e(this.getClass().getSimpleName(), "商品打6折的算法");
		return (int) (orgPrice * 0.6);
	}
}

    