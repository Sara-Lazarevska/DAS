import React, { useEffect, useState } from "react";
import axios from "axios";

function StockData() {
    const [stockData, setStockData] = useState([]);

    useEffect(() => {
        axios.get("http://localhost:8080/api/stocks")
            .then(response => {
                setStockData(response.data);
            })
            .catch(error => {
                console.error("There was an error fetching the stock data!", error);
            });
    }, []);

    return (
        <div>
            <h1>Stock Data</h1>
            <table>
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Price</th>
                </tr>
                </thead>
                <tbody>
                {stockData.map(stock => (
                    <tr key={stock.id}>
                        <td>{stock.name}</td>
                        <td>{stock.price}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    );
}

export default StockData;
