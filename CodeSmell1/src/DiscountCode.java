public enum DiscountCode {
  DISC10 {
      @Override
      public double apply(double totalPrice) {
          return totalPrice * 0.10;
      }
  },
  DISC20 {
      @Override
      public double apply(double totalPrice) {
          return totalPrice * 0.20;
      }
  },
  NONE {
      @Override
      public double apply(double totalPrice) {
          return 0;
      }
  };

  public abstract double apply(double totalPrice);

  public static DiscountCode from(String code) {
      try {
          return valueOf(code);
      } catch (IllegalArgumentException e) {
          return NONE;
      }
  }
}
