import java.util.*;
import java.util.function.*;

class ProductPipeline {
  private Predicate<Product> filter = p -> true;
  private Function<Product, String> transform = Product::toDisplayString;

  public ProductPipeline where(Predicate<Product> predicate) {
    // TODO: encadenar con .and()
    this.filter = this.filter.and(predicate);
    return this;
  }

  public ProductPipeline transform(Function<Product, String> fn) {
    this.transform = fn;
    return this;
  }

  public void forEach(List<Product> products, Consumer<String> action) {
    // TODO: filtrar productos, aplicar transformacion, ejecutar accion
    for (Product p : products) {
      if (this.filter.test(p)) {
        action.accept(this.transform.apply(p));
      }
    }
  }

  public long count(List<Product> products) {
    // TODO: contar productos que pasan el filtro
    long total = 0;
    for (Product p : products) {
      if (this.filter.test(p)) total++;
    }
    return total;
  }
}
