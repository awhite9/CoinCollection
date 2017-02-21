package controllers;


import models.CoinCollection;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;

import static play.libs.Json.toJson;

public class CoinCollectionController extends Controller
{
    private final FormFactory formFactory;
    private final JPAApi jpaApi;


    @Inject
    public CoinCollectionController(FormFactory formFactory, JPAApi jpaApi)
    {

        this.formFactory = formFactory;
        this.jpaApi = jpaApi;


    }

    @Transactional(readOnly = true)
    public Result getCoinCollection()
    {
        final int hundredCount = 0;
        final int twentyCount = 0;
        final int tenCount = 0;
        final int fiveCount = 0;
        final int oneCount = 0;
        final int quarterCount = 10;
        final int dimeCount = 5;
        final int nickelCount = 3;
        final int pennyCount = 2;

        CoinCollection coinCollection = new CoinCollection(hundredCount, twentyCount, tenCount, fiveCount, oneCount, quarterCount, dimeCount, nickelCount, pennyCount);

        return ok(toJson(coinCollection));
    }
    @Transactional(readOnly = true)
    public Result getChange()
    {

        CoinCollection coinCollection = new CoinCollection(new BigDecimal("567.67"));

        return ok(toJson(coinCollection));
    }
    @Transactional(readOnly = true)
    public Result getCoinCollectionHTML()
    {
        final int hundredCount = 0;
        final int twentyCount = 0;
        final int tenCount = 0;
        final int fiveCount = 0;
        final int oneCount = 0;
        final int quarterCount = 10;
        final int dimeCount = 5;
        final int nickelCount = 3;
        final int pennyCount = 2;

        CoinCollection coinCollection = new CoinCollection(hundredCount, twentyCount, tenCount, fiveCount, oneCount, quarterCount, dimeCount, nickelCount, pennyCount);

        return ok(views.html.coinCollection.render(coinCollection));

    }
    @Transactional(readOnly = true)
    public Result getChangeHTML(String changeText)
    {
        BigDecimal changeAmount = new BigDecimal(changeText);
        CoinCollection coinCollection = new CoinCollection(changeAmount);

        return ok(views.html.change.render(coinCollection, changeText));
    }

    public Result addChange()
    {
        DynamicForm dynaForm = formFactory.form().bindFromRequest();
        String changeText = dynaForm.get("changeAmount");
        return redirect(routes.CoinCollectionController.getChangeHTML(changeText));
    }
    public Result makeChange()
    {
     return ok(views.html.addChange.render());
    }

}
