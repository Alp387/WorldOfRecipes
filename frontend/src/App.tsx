import React from 'react';
import './App.css';
import RecipeGallery from "./RecipeGallery";
import useRecipes from "./useRecipes";

function App() {
    const {recipeCards} = useRecipes()
    return (
        <div className="App">
            <header>
                <h1>Welcome to World of Recipes</h1>
                <div>RecipeGallery</div>
                <RecipeGallery recipeCards={recipeCards}/>
            </header>
        </div>
    );
}

export default App;
