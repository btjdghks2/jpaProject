package com.running.springTraining.Controller;
import com.running.springTraining.Dto.*;
import com.running.springTraining.Service.AdminProductService;
import com.running.springTraining.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@T
public class AdminProductController {


    private final AdminProductService adminProductService;

    @PostMapping("/api/admin/new")
    public CreateProductResponse ProductSave(@RequestBody @Valid CreateProductResponse createProductResponse) {

        return adminProductService.join(createProductResponse);

    }

    @PutMapping("/api/admin/{id}/update/")
    public UpdateProductResponse ProductUpdate(@PathVariable Long id, @RequestBody UpdateProductResponse updateProductResponse) {

        return adminProductService.updatelogic(id, updateProductResponse);
    }

    @DeleteMapping("/api/admin/{id}/delete")
    public String ProductDelete(@PathVariable Long id) {

        return adminProductService.deletelogic(id);
    }







}
