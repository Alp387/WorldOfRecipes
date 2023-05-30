package de.worldofrecipes.backend;

import de.worldofrecipes.backend.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.getAllRecipes();
    }

    /*
    Service class receives a recipe without ID and generates a
    random ID a new Recipe
     */
    public Recipe addRecipe(Recipe recipe) {
        String randomId = UUID.randomUUID().toString();
        Recipe recipeWithRandomId = new Recipe(randomId,recipe.name());
        return recipeRepository.addRecipe(recipeWithRandomId);
    }
}
