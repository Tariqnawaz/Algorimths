/*
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". 

makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
 */
package basicAlgorithms.codingBat.string_1;

public class O12_String_MakeAbba {
	public static String makeAbba(String a, String b) {
		  return a + b + b + a;
		}

	public static void main(String[] args) {
		System.out.println("return the result of putting them together.."+makeAbba("Hi", "Bye"));
		System.out.println("return the result of putting them together.."+makeAbba("Yo", "Alice"));
		System.out.println("return the result of putting them together.."+makeAbba("What", "Up"));
		System.out.println("return the result of putting them together.."+makeAbba("aaa", "bbb"));
		System.out.println("return the result of putting them together.."+makeAbba("x", "y"));
		System.out.println("return the result of putting them together.."+makeAbba("x", ""));
		System.out.println("return the result of putting them together.."+makeAbba("", "y"));
		System.out.println("return the result of putting them together.."+makeAbba("Bo", "Ya"));
		System.out.println("return the result of putting them together.."+makeAbba("Ya", "Ya"));
		
	}
}
