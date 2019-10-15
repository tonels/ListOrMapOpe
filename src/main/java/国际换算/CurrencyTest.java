package 国际换算;

import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.Money;
import org.javamoney.moneta.format.CurrencyStyle;
import org.junit.Test;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.MonetaryConversions;
import javax.money.format.AmountFormatQueryBuilder;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;
import java.util.Currency;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CurrencyTest {

    @Test
    public void t1(){

        Currency c1 = Currency.getInstance("CNY"); //Australian Dollar
        Currency c2 = Currency.getInstance("JPY");  //Japan Yen
        Currency c3 = Currency.getInstance("USD");  //USA Yen

        // Use of getCurrencyCode() method
        String cCode1 = c1.getCurrencyCode();
        String cCode2 = c2.getCurrencyCode();
        System.out.println("人民币 代码 : " + cCode1);
        System.out.println("日元 代码 : " + cCode2);
        System.out.println("");

        // Use of getDefaultFractionDigits() method
        int D1 = c1.getDefaultFractionDigits();
        System.out.println("人民币 小数位数 ： " + D1);

        int D2 = c2.getDefaultFractionDigits();
        System.out.println("日元 小数位数  : " + D2);
        System.out.println("");

        // Use of getDisplayName() method
        System.out.println("人民币 显示 : "+c1.getDisplayName());
        System.out.println("日元 显示 : "+c2.getSymbol());
        System.out.println("");

        // Use of getSymbol() method
        System.out.println("日元 符号 : "+c2.getSymbol());
        System.out.println("美元 符号 : "+c3.getSymbol());
        System.out.println("人民币 符号 : "+c1.getSymbol());

    }

    // todo 货币换算
    @Test
    public void t2(){
        CurrencyUnit cny = Monetary.getCurrency("CNY");
        System.out.println("code: " + cny.getCurrencyCode() +
                "\nFractionDigits: " + cny.getDefaultFractionDigits()
                + "\nNumericCode: " +  cny.getNumericCode());
    }

    @Test
    public void t3(){
        CurrencyUnit usd = Monetary.getCurrency("USD");
        MonetaryAmount fstAmtUSD = Monetary.getDefaultAmountFactory().setCurrency(usd).setNumber(200).create();
        Money moneyof = Money.of(12, usd);
        FastMoney fastmoneyof = FastMoney.of(200, usd);

        System.out.println(usd.toString());
        System.out.println(fstAmtUSD.toString());
        System.out.println(moneyof.toString());
        System.out.println(fastmoneyof.toString());
//        USD
//        USD 200
//        USD 12
//        USD 200.00000
    }

    @Test
    public void t4(){
        MonetaryAmount oneDolar = Monetary.getDefaultAmountFactory()
                .setCurrency("USD").setNumber(1).create();
        Money oneEuro = Money.of(1, "EUR");
    }

    @Test
    public void t5(){
        MonetaryAmount[] monetaryAmounts = new MonetaryAmount[] {
                Money.of(100, "CHF"), Money.of(10.20, "CHF"), Money.of(1.15, "CHF")
        };

        Money sumAmtCHF = Money.of(0, "CHF");
        for (MonetaryAmount monetaryAmount : monetaryAmounts) {
            sumAmtCHF = sumAmtCHF.add(monetaryAmount);
        }
        System.out.println(sumAmtCHF.toString()); // CHF 111.35

    }

    @Test
    public void t6(){
        CurrencyUnit usd = Monetary.getCurrency("USD");

        Money moneyof = Money.of(12, usd);
        MonetaryAmount fstAmtUSD = Monetary.getDefaultAmountFactory().setCurrency(usd).setNumber(200.50).create();
        MonetaryAmount oneDolar = Monetary.getDefaultAmountFactory().setCurrency("USD").setNumber(1).create();
        Money subtractedAmount = Money.of(1, "USD").subtract(fstAmtUSD); // 减法运算
        MonetaryAmount multiplyAmount = oneDolar.multiply(0.25); // 乘法运算
        MonetaryAmount divideAmount = oneDolar.divide(0.25); // 除法运算

        assertEquals("USD", usd.toString());
        assertEquals("USD 1", oneDolar.toString());
        assertEquals("USD 200.5", fstAmtUSD.toString());
        assertEquals("USD 12", moneyof.toString());
        assertEquals("USD -199.5", subtractedAmount.toString());
        assertEquals("USD 0.25", multiplyAmount.toString());
        assertEquals("USD 4", divideAmount.toString());

    }

     // 保留几位数字
    @Test
    public void t7(){

        MonetaryAmount fstAmtEUR = Monetary.getDefaultAmountFactory().setCurrency("EUR").setNumber(1.30473908).create();

        MonetaryAmount roundEUR = fstAmtEUR.with(Monetary.getDefaultRounding());

        assertEquals("EUR 1.30473908", fstAmtEUR.toString());
        assertEquals("EUR 1.3", roundEUR.toString());

    }

    @Test
    public void t8(){
        MonetaryAmount oneDollar = Monetary.getDefaultAmountFactory().setCurrency("USD").setNumber(1).create();

        CurrencyConversion conversionEUR = MonetaryConversions.getConversion("EUR");

        MonetaryAmount convertedAmountUSDtoEUR = oneDollar.with(conversionEUR);

//        System.out.println(convertedAmountUSDtoEUR.toString());

        assertEquals("USD 1", oneDollar.toString());
        assertNotNull(convertedAmountUSDtoEUR);

    }

    @Test
    public void t9() {
        MonetaryAmount oneDollar = Monetary.getDefaultAmountFactory().setCurrency("USD").setNumber(1).create();

        MonetaryAmountFormat formatUSD = MonetaryFormats.getAmountFormat(Locale.US);
        String usFormatted = formatUSD.format(oneDollar);

        assertEquals("USD 1", oneDollar.toString());
        assertNotNull(formatUSD);
        assertEquals("USD1.00", usFormatted);
    }

    @Test
    public void t10() {
        MonetaryAmount oneDollar = Monetary.getDefaultAmountFactory().setCurrency("USD").setNumber(1).create();

        MonetaryAmountFormat customFormat = MonetaryFormats.getAmountFormat(AmountFormatQueryBuilder.
                of(Locale.US).set(CurrencyStyle.NAME).set("pattern", "00000.00 ¤").build());
        String customFormatted = customFormat.format(oneDollar);

        assertNotNull(customFormat);
        assertEquals("USD 1", oneDollar.toString());
        assertEquals("00001.00 US Dollar", customFormatted);
    }



}
