import {Recipe} from "./Recipe";
import RecipeCard from "./RecipeCard";
import './RecipeGallery.css'

type RecipeGalleryProps = {
    recipeCards: Recipe[],
}

export default function RecipeGallery(props: RecipeGalleryProps) {

    return (
        <div className="recipe-gallery">
            {props.recipeCards.map((card) => {
                    return (<RecipeCard key={card.id} recipe={card}/>)
                }
            )}
        </div>
    )
}