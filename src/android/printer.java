package cordova.plugin.printer;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class printer extends CordovaPlugin 
{
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext cBack) throws JSONException 
    {
        if (action.equals("printMethod")) 
        {
            String message = args.getString(0);
            this.printMethod(message, cBack);
            return true;
        }
        else if(action.equals("plus"))
        {
            this.plus(args, cBack);
            return true;
        }
        else if(action.equals("moin"))
        {
            this.moin(args, cBack);
            return true;
        }
        return false;
    }

    private void printMethod(String message, CallbackContext cBack) 
    {
        if (message != null && message.length() > 0) 
        {
            cBack.success(message);
        }
        else 
        {
            cBack.error("Expected one non-empty string argument.");
        }
    }
    
    // Fonction d'addition
    private void plus(JSONArray args, CallBackContext cBack)
    {
        if(args != null)
        {
            try
            {
                int one = Integer.ParseInt(args.getJSONObject(0).getString("arg1"));
                int two = Integer.ParseInt(args.getJSONObject(0).getString("arg2"));
                cBack.success(one + two);
            }
            catch(Exception exp)
            {
                cBack.success("NOT OK AT ALL FOR ME CHECK IT : " + exp);
            }            
        }
        else
        {
            cBack.success("NOT OK FOR ME");
        }
    }
    
    // Fonction de soustraction
    private void moin(JSONArray args, CallBackContext cBack)
    {
        if(args != null)
        {
            try
            {
                int one = Integer.ParseInt(args.getJSONObject(0).getString("arg1"));
                int two = Integer.ParseInt(args.getJSONObject(0).getString("arg2"));
                cBack.success(one - two);
            }
            catch(Exception exp)
            {
                cBack.success("NOT OK AT ALL FOR ME CHECK IT : " + exp);
            }            
        }
        else
        {
            cBack.success("NOT OK FOR ME");
        }
    }
}
