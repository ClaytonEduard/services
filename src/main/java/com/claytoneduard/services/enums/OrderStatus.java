package com.claytoneduard.services.enums;

public enum OrderStatus {
  // definir a numeracao para manutencoes posteriores

  WAITING_PAYMENT(1),
  PAID(2),
  SHIPPED(3),
  DELIVERED(4),
  CANCELED(5);

  private int code;

  // cosntrutor
  private OrderStatus(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public static OrderStatus valueOf(int code) {
    for (OrderStatus value : OrderStatus.values()) {
      if (value.getCode() == code) {
        return value;
      }
    }
    throw new IllegalArgumentException("Invalid OrderStatus code");
  }
}
