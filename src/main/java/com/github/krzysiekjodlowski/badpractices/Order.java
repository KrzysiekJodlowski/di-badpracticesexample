package com.github.krzysiekjodlowski.badpractices;

import com.google.inject.Inject;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Whats wrong with this class in terms of of dependency injection?
 * By the way - do you see any problems related to OOP principles?
 * Please notice that there is more than one type of pizza in the
 * system and that we are using an additional tool for handling DI.
 */
class Order {
  @Inject
  private int orderNumber;
  @Inject
  private BigDecimal price;
  @Inject
  private BigDecimal promotionRate;
  @Inject
  private LocalDate orderDate;
  @Inject
  private String orderingName;
  @Inject
  private String orderAddress;
  @Inject
  private String phoneNumber;
  @Inject
  private PizzaSize pizzaSize;

  void makePizzaSpeakForItself() {
    ItalianPizza italianPizza = new ItalianPizza();
    System.out.println(italianPizza.toString());
  }
}
