/*
 *   Copyright (c) 2024 WSO2 Inc. (http://www.wso2.org)
 *   All rights reserved.
 *   
 *   This software is the property of WSO2 Inc. and its suppliers, if any.
 *   Dissemination of any information or reproduction of any material contained
 *   herein in any form is strictly forbidden, unless permitted by WSO2 expressly.
 *   You may not alter or remove any copyright or other notice from copies of this content.
 */
package com.example;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private final Calculator calculator = new Calculator();
   public void testAdd() {
       System.out.println("Running testAdd");
       assertEquals(5, calculator.add(2, 3));
   }

   public void testSubtract() {
       System.out.println("Running testSubtract");
       assertEquals(1, calculator.subtract(3, 2));
   }
}
