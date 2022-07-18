package com.sew.expense.expensemanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

  /**
   * Returns sum of given numbers.
   * @param a a
   * @param b b
   * @return
   */
  @GetMapping("/expense/{a}/{b}")
  public int totalExpense(@PathVariable int a, @PathVariable int b) {
    return a + b;
  }
}
