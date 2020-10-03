CREATE TABLE recipe (
    id int PRIMARY KEY,
    name varchar(255),
    prepTime int,
    cookTime int
);

CREATE TABLE ingredient (
    id int PRIMARY KEY,
    name varchar(255)
);

CREATE TABLE recipe_ingredients (
    recipeId int FOREIGN KEY REFERENCES recipe(id),
    ingredientId int FOREIGN KEY REFERENCES ingredient(id),
    quantity int,
    UNIQUE (recipeId, ingredientId)
);

CREATE TABLE recipe_methods (
    recipeId int FOREIGN KEY REFERENCES recipe(id),
    method text,
    additionalNotes text
)