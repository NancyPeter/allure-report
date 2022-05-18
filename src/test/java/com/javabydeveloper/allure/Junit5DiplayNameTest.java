package com.javabydeveloper.allure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import com.javabydeveloper.util.MathUtil;

import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Epic("TEST EPIC")
@DisplayName("MathUtil Test Case")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class Junit5DiplayNameTest {
	
	@Test
	@Story("TEST STORY")
	void test_Add() {
		assertEquals(5, MathUtil.add(3, 2));
		test_Devide();
	}
	
	@Test
	@DisplayName("MathUtil multiply test")
	void test_Multiply() {
		assertEquals(15, MathUtil.multiple(3, 5));
	}

	@Step("TEST STEP")
	@DisplayName("MathUtil devide test")
	void test_Devide() {
		assertEquals(5, MathUtil.devide(25, 5));
	}
	
	@Test
	@DisplayName("MathUtil isPrime test")
	void test_IsPrime() {
		assertTrue(MathUtil.isPrime(13));
	}
}
