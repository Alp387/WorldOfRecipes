package de.worldofrecipes.backend;

import de.worldofrecipes.backend.model.Recipe;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RecipeRepository {
    private Map<String, Recipe> recipeMap;

    public RecipeRepository() {
        this.recipeMap = new HashMap<>();
        this.recipeMap.put("1", new Recipe("1", "Cacik"));
        this.recipeMap.put("2", new Recipe("2", "Linsensuppe"));
        this.recipeMap.put("3", new Recipe("3", "Milchreis"));
    }

    public List<Recipe> getAllRecipes() {
        return new ArrayList<>(recipeMap.values());
    }
}
