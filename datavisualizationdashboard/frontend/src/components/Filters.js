import React from 'react';

const Filters = ({ onFilterChange }) => {
    const handleInputChange = (e) => {
        onFilterChange(e.target.name, e.target.value);
    };

    return (
        <div>
            <input type="number" name="endYear" placeholder="End Year" onChange={handleInputChange} />
            <input type="text" name="topics" placeholder="Topics" onChange={handleInputChange} />
            <input type="text" name="sector" placeholder="Sector" onChange={handleInputChange} />
            <input type="text" name="region" placeholder="Region" onChange={handleInputChange} />
            <input type="text" name="pest" placeholder="PEST" onChange={handleInputChange} />
            <input type="text" name="source" placeholder="Source" onChange={handleInputChange} />
            <input type="text" name="swot" placeholder="SWOT" onChange={handleInputChange} />
            <input type="text" name="country" placeholder="Country" onChange={handleInputChange} />
            <input type="text" name="city" placeholder="City" onChange={handleInputChange} />
        </div>
    );
};

export default Filters;
