package com.cts.coupon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.coupon.entity.Coupon;
import com.cts.coupon.service.CouponServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/coupon")
@RestController
@Slf4j
public class CouponController {
	@Autowired
	private CouponServiceImpl service;
	
	@PostMapping
	public Coupon saveCoupon(@RequestBody Coupon coupon) {
		return service.saveCoupon(coupon);
	}
	
	@GetMapping("/{couponcode}")
	public Coupon getCouponByCode(@PathVariable("couponcode") String couponCode) {
		log.info("server 1");
		return service.getCouponByCode(couponCode);
		
	}

}
