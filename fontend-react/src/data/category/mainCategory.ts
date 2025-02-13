export const mainCategory = [
  {
    name: "Cleaning",
    categoryId: "men",
    level: 1,
    levelTwoCategory:[
        {
            "name": "House",
            "categoryId": "house",
            "parentCategoryId":"men",
            "level":2
        },
        {
            "name": "Bathroom",
            "categoryId": "bathroom",
            "parentCategoryId":"men",
            "level":2
        },
        {
            "name": "Kitchen",
            "categoryId": "kitchen",
            "parentCategoryId":"men",
            "level":2
        },
       
       
    ]
  },
  {
    name: "Cooking",
    categoryId: "women",
    level: 1,
    levelTowCategory:[
        {
          "parentCategoryId":"women",
          "level":2,
          "name":"Daily Meal",
          "categoryId": "daily_meal"
        },
        {
          "parentCategoryId":"women",
          "level":2,
          "name":"Breakfast",
          "categoryId": "breakfast"
        },
       
       
       
      ]
      
  },
  {
    name: "Baby Sitting and Child Care",
    categoryId: "home_furniture",
    level: 1,
  },
  
  // { name: "Electronics", categoryId: "electronics",level:1 },
];
