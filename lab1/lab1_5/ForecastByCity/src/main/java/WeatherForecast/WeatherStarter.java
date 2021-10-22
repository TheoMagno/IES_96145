package WeatherForecast;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import IpmaAPI.*;
import java.util.logging.Logger;

/**
 * demonstrates the use of the IPMA API for weather forecast
 */
public class WeatherStarter {
    /*
    loggers provide a better alternative to System.out.println
    https://rules.sonarsource.com/java/tag/bad-practice/RSPEC-106
     */
    private static final Logger logger = Logger.getLogger(WeatherStarter.class.getName());

    public static void  main(String[] args ) {

        /*
        get a retrofit instance, loaded with the GSon lib to convert JSON into objects
         */
        System.out.print("City ID: ");
        int CITY_ID = 0;
        if (args.length > 0) { CITY_ID = Integer.parseInt(args[0]); }
        else { CITY_ID = 1010500 ;}
        System.out.println(CITY_ID);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IpmaService service = retrofit.create(IpmaService.class);
        Call<IpmaCityForecast> callSync = service.getForecastForACity(CITY_ID);

        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

            if (forecast != null) {
                logger.info("\t" + forecast.getData().listIterator().next().getForecastDate() + "\n\tprecipitaion probability: "+ forecast.getData().listIterator().next().getPrecipitaProb() + "\n\tmax temperature: " + forecast.getData().
                        listIterator().next().getTMax() + "\n\tmin temperature: " + forecast.getData().
                        listIterator().next().getTMin() + "\n\twind direction: " + forecast.getData().
                        listIterator().next().getPredWindDir() + "\n\twind speed: " + forecast.getData().
                        listIterator().next().getClassWindSpeed() +"\n\tweather type: " + forecast.getData().
                        listIterator().next().getIdWeatherType() + "\n\tlatitude: " + forecast.getData().
                        listIterator().next().getLatitude() + "\n\tlongitude: " + forecast.getData().
                        listIterator().next().getLongitude());
            } else {
                logger.info( "No results!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
