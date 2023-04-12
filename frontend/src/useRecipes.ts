import {Recipe} from "./Recipe";
import axios from "axios";
import {useEffect, useState} from "react";

export default function useRecipes() {
    const [recipeCards, setRecipes] = useState<Recipe[]>([])

    useEffect(() => {
        loadAllRecipe()
    }, [])

    function loadAllRecipe() {
        axios.get("/api/recipes")
            .then((getAllRecipesResponse) => {
                setRecipes(getAllRecipesResponse.data)
            }).catch((error) => {
            console.error(error)
        })
    }
return {recipeCards}
}