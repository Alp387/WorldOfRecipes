import {Recipe} from "./Recipe";


type RecipeCardProps = {
    recipe: Recipe
}
export default function RecipeCard(props: RecipeCardProps) {

    return (
        <div className="recipe-card">
            <p>Id: {props.recipe.id}</p>
            <p>{props.recipe.name}</p>
        </div>

    )


}