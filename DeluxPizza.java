public class DeluxPizza extends  Pizza{
    public DeluxPizza(Boolean veg){
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        super.addExtraCheese();
    }

    @Override
    public void addExtraToppings() {
        super.addExtraToppings();
    }
}
