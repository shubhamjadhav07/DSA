SELECT p.product_id, IFNULL(ROUND(SUM(price*units)/SUM(units),2),0) as average_price
FROM Prices p 
LEFT JOIN UnitsSold u
ON p.product_id=u.product_id 
AND u.purchase_date between p.start_date AND p.end_date 
GROUP BY 1
ORDER BY 2