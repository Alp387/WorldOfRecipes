package de.worldofrecipes.backend;

import de.worldofrecipes.backend.model.Recipe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;

    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.getAllRecipes();
    }
}
