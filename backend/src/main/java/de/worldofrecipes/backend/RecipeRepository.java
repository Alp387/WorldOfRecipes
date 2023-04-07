package de.worldofrecipes.backend;

import de.worldofrecipes.backend.model.Recipe;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class RecipeRepository {
    private Map<String,Recipe> recipeMap;
    public RecipeRepository(){
        recipeMap.put("1",new Recipe("1","Cacik"));
        recipeMap.put("2",new Recipe("2","Linsensuppe"));
        recipeMap.put("3",new Recipe("3","Milchreis"));
    }

    public List<Recipe> getAllRecipes() {
        return new ArrayList<>(recipeMap.values());
    }
}
