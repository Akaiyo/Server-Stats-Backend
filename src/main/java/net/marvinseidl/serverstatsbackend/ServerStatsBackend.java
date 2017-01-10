package net.marvinseidl.serverstatsbackend;

import net.marvinseidl.serverstatsbackend.spark.JsonTransformer;
import org.bukkit.plugin.java.JavaPlugin;
import spark.ResponseTransformer;

import static spark.Spark.get;
import static spark.Spark.stop;

/**
 * Created by Marvin Seidl on 06.01.2017.
 */
public class ServerStatsBackend extends JavaPlugin{

   private static final ResponseTransformer TRANSFORMER_JSON = new JsonTransformer();

    @Override
    public void onEnable() {
        super.onEnable();

        get("/test",(req, res) -> "Test");
    }

    @Override
    public void onDisable() {
        stop();
    }
}
