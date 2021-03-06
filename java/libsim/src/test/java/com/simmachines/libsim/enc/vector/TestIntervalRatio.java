package com.simmachines.libsim.enc.vector;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestIntervalRatio {

	@Test
	//jdsalazar
	public void test1(){
		int[] v1 = {1,2,3};
		int[] v2 = {2,3,1};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = IntervalRatio.distance(v1, v2);
		Asserts.assertEquals(res, 3.83333333);
	}
	
	@Test
	//jdsalazar
	public void test2(){
		int[] v1 = {5,4,3,2,1};
		int[] v2 = {4,1,3,5,2};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = IntervalRatio.distance(v1, v2);
		Asserts.assertEquals(res, 6.95);
	}
	
	@Test
	//jdsalazar
	public void test3(){
		int[] v1 = {3,5,2,1,4};
		int[] v2 = {1,2,3,4,5};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = IntervalRatio.distance(v1, v2);
		Asserts.assertEquals(res, 6.81666666);
	}
	
	//no zeros allowed
/*	
	@Test
	//jfquesada
	public void test4(){
		int[] v1 = new int[]{0, 0, 0, 0, 0};
		int[] v2 = new int[]{1, 1, 1, 1, 1};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = IntervalRatio.distance(v1, v2);
		Asserts.assertEquals(res, 0.0);
	}
	
	@Test
	//jfquesada
	public void test5(){
		int[] v1 = new int[]{1, 1, 1, 1, 1};
		int[] v2 = new int[]{0, 0, 0, 0, 0};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = IntervalRatio.distance(v1, v2);
		Asserts.assertEquals(res, Double.NaN);
	}
*/	
	@Test
	//jfquesada
	public void test6(){
		int[] v1 = new int[]{638, 398, 337, 529, 514};
		int[] v2 = new int[]{689, 869, 383, 706, 620};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = IntervalRatio.distance(v1, v2);
		Asserts.assertEquals(res, 2.223702941795193);
	}
	
	@Test
	//jfquesada
	public void test7(){
		int[] v1 = new int[]{1541367828, 950213225, 52610973, 1431957942, 452032515};
		int[] v2 = new int[]{1572602206, 598716249, 536608579, 84359194, 2018058772};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = IntervalRatio.distance(v1, v2);
		Asserts.assertEquals(res, 262.7207954735563);
	}
	
	@Test
	//jfquesada
	public void test8(){
		int[] v1 = new int[]{1141454369, 589096141, 922770477, 822465917, 423607600};
		int[] v2 = new int[]{247243949, 375221325, 851955869, 530827397, 1139764455};
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertPositiveValues(v1);
		Asserts.assertPositiveValues(v2);
		double res = IntervalRatio.distance(v1, v2);
		Asserts.assertEquals(res, 5.989448427075609);
	}
	
}
