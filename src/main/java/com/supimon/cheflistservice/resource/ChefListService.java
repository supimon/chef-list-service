package com.supimon.cheflistservice.resource;

import com.supimon.cheflistservice.models.ChefItem;
import com.supimon.cheflistservice.models.ChefListWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/chef-listing")
public class ChefListService {

    @RequestMapping("/{filter}")
    public ChefListWrapper getChefs(@PathVariable("filter") String filter){

        List<ChefItem> chefs = Arrays.asList(

                new ChefItem(
                        "1234",
                        "Bhajan Singh",
                        "https://upload.wikimedia.org/wikipedia/commons/4/48/Outdoors-man-portrait_%28cropped%29.jpg",
                        "chinese, indian, american",
                        10),

                new ChefItem(
                        "5678",
                        "Karan Singh",
                        "https://upload.wikimedia.org/wikipedia/commons/4/48/Outdoors-man-portrait_%28cropped%29.jpg",
                        "south-indian, north-indian",
                        6),

                new ChefItem(
                        "2222",
                        "Puran Singh",
                        "https://upload.wikimedia.org/wikipedia/commons/4/48/Outdoors-man-portrait_%28cropped%29.jpg",
                        "american, italian",
                        15),

                new ChefItem(
                        "3333",
                        "Pie Singh",
                        "https://upload.wikimedia.org/wikipedia/commons/4/48/Outdoors-man-portrait_%28cropped%29.jpg",
                        "Thai, Korean, Japanese",
                        23)
        );

        ChefListWrapper chefListWrapper = new ChefListWrapper();
        chefListWrapper.setChefItems(chefs);

        return chefListWrapper;
    }
}
