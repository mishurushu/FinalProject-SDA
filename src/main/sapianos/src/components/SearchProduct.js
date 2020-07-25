import React from 'react'
import {Card,Table} from 'react-bootstrap'

class SearchProduct extends  React.Component{
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
                        <th>Cook</th>
                        <th>Description</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr align="center">
                       <td colSpan="6">No product yet</td>
                    </tr>
                    </tbody>
                </Table>
            </Card.Body>
        </Card>
        );
    }
}

export default SearchProduct