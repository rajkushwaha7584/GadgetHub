/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.dao;

import in.gadgethub.pojo.Demandpojo;
import java.util.List;

/**
 *
 * @author rj851
 */
public interface DemandDAO {
    public Boolean addProduct(Demandpojo demandPojo);
    public Boolean removeProduct(String userId, String prodId);
    public List<Demandpojo>haveDemanded(String prodId);
}
