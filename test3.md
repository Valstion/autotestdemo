## Automation tests for www.etsy.com

#### Link to the page - [www.etsy.com](https://www.etsy.com)

1. Create Collection: `Account Profile`
   - Click account menu button;
   - Select view your account button;
   - Close pop up window;
   - Click "Create collection" button (+);
   - Enter collection name;
   - Click "Create collection" button;

   Expected result: List of collections should contain newly created collection.
2. Update account preferences: `Account Profile`
   - Click account menu button;
   - Select account settings button;
   - Click "Preferences" tab;
   - Select currency - EUR;
   - Click on "Receive Postal Mail" checkbox;
   - Click on "Receive Phone Calls" checkbox;
   - Click "Update Preferences" button;

   Expected result: Should be given a message for successful update and chosen options should be saved. 

3. Add product to cart: `Cart page`
    - Click on product;
    - Select primary color - "Rose Gold";
    - Select number of bars - "1 Heart No Bar";
    - Enter personalization information - "Heart: Flower";
    - Click "Add to cart" button;
    - Click "Create collection" button;

   Expected result: Product should be added to cart with chosen preferences.
4. Filter products with sale: `Clothing&Shoes page`
    - Click "All Filters" button;
    - Click on "On Sale" checkbox;
    - Click "Apply" button;

   Expected result: Shown products should be listed as on sale.
5. Search for a product: `Home page`
    - Enter search object - "Golden Rings";
    - Click "Search" button; 

   Expected result: Shown products should include anything from "Golden rings".
6. Sort products by lowest price: `Vintage page`
   - Click "Sort By" button;
   - Select "Lowest price";

   Expected result: Shown products should be sorted from the lowest price and up.
 52  
src/test/java/readme/readme02.md
@@ -0,0 +1,52 @@
# Project Receptorius
## Setup
### Site used for testing
[receptorius](https://receptorius.lt/)
### Packages used
- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`
## Test cases
### **Add To Cart**
- Test 1 (addItemsToCart)

*Try to add available amount of items into cart*
1. Open page of one of the items in the Store
2. Click on button "1kg"
3. Click add amount button one time
4. Click "Add to cart" button
5. Cart item window appears, check if window contains text "Prekė sėkmingai pridėta"
6. Click "Continue shopping" button
7. Check if cart icon shows that 2 items are in the cart
### Login
- Test 1 (tryToLogInWithNonExistingAccountInfo)

*Try to log in with non-existing account information*
1. Open log in page
2. Input email(vardenis@email.com) and password(password)
3. Click "Login" button
4. Alert message appears, check if alert message is "Identifikavimas nepavyko"
- Test 2 (tryToLogInWithExistingAccountInfo)

*Try to log in with existing account information*
1. Open log in page
2. Input email(vismante.lisauskaite@gmail.com) and password(vcsprojektas)
3. Click "Login" button
4. Check if account name(Vismante Lisauskaite) appeared on top and current Url is correct
### Spice Search
- Test 1 (searchForSpicesWithSearchBar)

*Try to search for spices with search bar*
1. Open main page
2. Add spice name(Deggi Mirch) to search bar
3. Click "Search" button
4. Check if spice element(Deggi Mirch) is present
- Test 2 (searchForSpicesWithFilters)

*Try to search for a spice with filters*
1. Drag mouse to section(Produktai)
2. Click on section(Grynieji prieskoniai) that appeared
3. Check if spice element(random) is present on the page
4. Click button "Čili pipirai" from dropdown menu 
5. Click on checkbox "Aštrus"
6. Check if spice element(Deggi Mirch) is present and spice element(random) is not 