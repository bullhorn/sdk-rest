package com.bullhornsdk.data.model.response.list;

import java.util.List;

/**
 * Interface that wraps a list of RestEntities of type T.
 * 
 * @author magnus.palm
 * 
 * @param <T>
 */
public interface ListWrapper<T> {

    /**
     * Returns the List of RestEntities of type T.
     * 
     * @return
     */
    public List<T> getData();

    public Integer getCount();

    public Integer getStart();

    public Integer getTotal();

    public void setData(List<T> data);

    public void setCount(Integer count);

    public void setStart(Integer start);

    public void setTotal(Integer total);
    
    
    

}
