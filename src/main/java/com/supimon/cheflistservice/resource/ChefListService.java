package com.supimon.cheflistservice.resource;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import com.supimon.cheflistservice.models.ChefItem;
import com.supimon.cheflistservice.models.ChefListWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/chef-listing")
public class ChefListService {

    @RequestMapping("/{filter}")
    public ChefListWrapper getChefs(@PathVariable("filter") String filter) throws InterruptedException, ExecutionException {

        Firestore db = FirestoreClient.getFirestore();

        // https://firebase.google.com/docs/firestore/quickstart
        // asynchronously retrieve all users
        ApiFuture<QuerySnapshot> query = db.collection("chef-details").get();
        // query.get() blocks on response
        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();

        List<ChefItem> chefs = new ArrayList<>();

        for (QueryDocumentSnapshot document : documents) {
            ChefItem chef = new ChefItem(
                    document.getString("chefId"),
                    document.getString("name"),
                    document.getString("imgUrl"),
                    document.getString("skills"),
                    document.getLong("experience")
            );
            chefs.add(chef);
        }

        ChefListWrapper chefListWrapper = new ChefListWrapper();
        chefListWrapper.setChefItems(chefs);

        return chefListWrapper;
    }
}
