package com.cts.coupon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.coupon.entity.Coupon;
import com.cts.coupon.repository.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService {
	
	@Autowired
	CouponRepository couponRepository;

	@Override
	public Coupon saveCoupon(Coupon coupon) {
		
		return couponRepository.save(coupon);
	}

	@Override
	public Coupon getCouponByCode(String couponCode) {
		
		return couponRepository.findByIdString(couponCode);
	}

}
