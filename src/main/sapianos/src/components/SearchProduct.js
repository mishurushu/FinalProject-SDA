import React from 'react'
import {Card,Table} from 'react-bootstrap'
import axios from 'axios';

class SearchProduct extends  React.Component{

    constructor(props) {
        super(props);
        this.state = {
            products : [],
            deliverys : []
        };
    }

    componentDidMount() {
        axios.get("http://localhost:8080/rest/product/")
            .then(response => response.data)
            .then((data) => {this.setState({products: data})});
    }

    render() {
        return(
        <Card className="border border-dark bg-dark text-white ">
          <Card.Header>Search Product </Card.Header>
            <Card.Body>
                <Table striped bordered hover variant="dark">
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Delivery</th>
                        <th>DD/MM/YYYY</th>
                        <th>Cook</th>
                        <th>Description</th>
                    </tr>
                    </thead>
                    <tbody>
                    {this.state.products.length === 0 ?
                        <tr align="center">
                            <td colSpan="6">No product yet</td>
                        </tr> :
                        this.state.products.map((product) => (
                        <tr key={product.id}>
                            <td>{product.productName}</td>
                            <td>{product.price}</td>
                        </tr>

                        ))
                    }
                    </tbody>
                </Table>
            </Card.Body>
        </Card>
        );
    }
}

export default SearchProduct