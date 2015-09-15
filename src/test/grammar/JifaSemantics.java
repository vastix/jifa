//=========================================================================
//
//  This skeleton was generated by Mouse 1.7 at 2015-09-15 15:19:19 GMT
//  from grammar
//    '/home/bpdp/kerjaan/git-repos/vastix/jifa/src/test/grammar/JifaGramma
//    r.peg'.
//
//=========================================================================

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;

class JifaSemantics extends mouse.runtime.SemanticsBase
{

    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {

        Request request = new Request.Builder()
            .url(url)
            .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }
   
  //-------------------------------------------------------------------
  //  Line = Force Space Propositional+
  //-------------------------------------------------------------------
  void lineProcessed()
    {
        String propositional;
        String response;

        // Without this one, propositional will include double quote
        // " .... ", so we have to delete double quote in the beginning
        // and in the end.
        propositional = rhs(2).text().substring(1, rhs(2).text().length()-1);

        //System.out.println("Scraping " + rhs(2).text() + "...");
        System.out.println("Scraping " + propositional + "...");

        try {
            response = run((String)propositional);
            System.out.println(response);
        } catch (Exception exp) {
            System.out.println("Error: " + exp.getMessage());
        }

    }
  
  //-------------------------------------------------------------------
  //  Propositional = StringLiteral
  //-------------------------------------------------------------------
  void getPropositional()
    {
        int rSize = rhsSize();
        for (int i=0; i<rSize; i+=1) {
            lhs().put(rhs(i));
        }
       
    }
  
}
