package in.sandipan.foodiesapi.service;

import org.springframework.web.multipart.MultipartFile;

import in.sandipan.foodiesapi.io.FoodRequest;
import in.sandipan.foodiesapi.io.FoodResponse;

import java.util.List;

public interface FoodService {

    String uploadFile(MultipartFile file);

    FoodResponse addFood(FoodRequest request, MultipartFile file);

    List<FoodResponse> readFoods();

    FoodResponse readFood(String id);

    boolean deleteFile(String filename);

    void deleteFood(String id);
}
