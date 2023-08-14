package org.web.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

  @GetMapping("/admin/product")
  public String getProductPage() {
    return "product";
  }

  @GetMapping("/admin/product/list")
  public String getProductList(Model model) {
    model.addAttribute("product", "product 1");
    return "productList :: list";
  }
}
