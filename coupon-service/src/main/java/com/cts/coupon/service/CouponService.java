package com.cts.coupon.service;

import com.cts.coupon.entity.Coupon;

public interface CouponService {
	Coupon saveCoupon(Coupon coupon);
	Coupon getCouponByCode(String couponCode);

}
