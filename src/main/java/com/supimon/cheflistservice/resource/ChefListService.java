package com.supimon.cheflistservice.resource;

import com.supimon.cheflistservice.models.ChefItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/chef-listing")
public class ChefListService {

    @RequestMapping("/{chefId}")
    public List<ChefItem> getChefs(@PathVariable("chefId") String filter){
        return Collections.singletonList(
          new ChefItem(
                  "1234",
                  "Bhajan Singh",
                  "https://upload.wikimedia.org/wikipedia/commons/4/48/Outdoors-man-portrait_%28cropped%29.jpg",
                  "chinese, indian, american",
                  10,
                  4.5,
                  true,
                  12)
        );
    }
}
