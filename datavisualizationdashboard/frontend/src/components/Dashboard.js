import React, { useEffect, useState } from 'react';
import { Bar } from 'react-chartjs-2';
import Filters from './Filters';

const Dashboard = () => {
    const [data, setData] = useState([]);
    const [filters, setFilters] = useState({});

    useEffect(() => {
        const query = Object.keys(filters)
            .map(key => `${key}=${filters[key]}`)
            .join('&');
        fetch(`/data?${query}`)
            .then(response => response.json())
            .then(data => setData(data));
    }, [filters]);

    const handleFilterChange = (name, value) => {
        setFilters({ ...filters, [name]: value });
    };

    const chartData = {
        labels: data.map(d => d.year),
        datasets: [
            {
                label: 'Intensity',
                data: data.map(d => d.intensity),
                backgroundColor: 'rgba(75, 192, 192, 0.6)'
            }
        ]
    };

    return (
        <div>
            <h1>Data Visualization Dashboard</h1>
            <Filters onFilterChange={handleFilterChange} />
            <Bar data={chartData} />
        </div>
    );
};

export default Dashboard;
