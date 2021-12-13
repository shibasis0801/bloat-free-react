import React from 'react';
import { render } from 'react-dom';

const HelloWorld = () => {
    return (
        <h3>Hello World</h3>
    );
};

render(<HelloWorld />, document.getElementById('root'));
