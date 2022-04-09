package com.cts.coupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.coupon.entity.Coupon;


@Repository
public interface CouponRepository extends JpaRepository<Coupon, Integer>{
	
	@Query(value = "select * from Coupon p where p.coupon_code=:couponCode",nativeQuery=true)
	public Coupon findByIdString(@Param("couponCode") String couponCode);
	
	

}
