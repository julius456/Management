/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management.utils;

import java.util.List;
import management.constants.Constant;
import management.model.Address;
import management.model.ContentResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 *
 * @author junie
 */
public interface Service {
    
    @GET(Constant.GETALLSCANBYESTABLISHMENT_URL)
    Call<ContentResponse> getAllScannedByEstablishment(@Path("pageNumber") int pageNumber, @Path("pageSize") int pageSize);
    
    @GET(Constant.ADRRESSOFUSERS_URL)
    Call<List<Address>> addressOfUser(@Path("userid") long userid);
    
}
