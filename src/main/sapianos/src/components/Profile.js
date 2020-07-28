import React from 'react'
import {Card, Table} from "react-bootstrap";
import Form from "react-bootstrap/cjs/Form";
import Button from "react-bootstrap/Button";
import Col from "react-bootstrap/Col";

class Profile extends  React.Component{


    constructor(props) {
        super(props);
        this.state = {email:'',username:'',firstName:'',secondName:'',city:'',tara:'',zip:''};
        this.profileChange = this.profileChange.bind(this);
        this.submitProfile = this.submitProfile.bind(this);
    }

    submitProfile(event) {
        alert('Email: ' +this.state.email + ' Username: '+ this.state.username + ' SecondName: ' + this.state.secondName+ ' City: ' +
            this.state.city + ' State: ' + this.state.tara + ' Zip: ' + this.state.zip)
        event.preventDefault();
    }

    profileChange(event){
        this.setState({
            [event.target.name]:event.target.value
        })
    }

    render() {
        return(


            <Card className="border border-dark bg-dark text-white ">
            <Card.Header>Edit Profile - Complete your profile</Card.Header>
            <Card.Body>
                <Form onSubmit={this.submitProfile} id={"profileFormId"}>
                    <Form.Row>
                        <Form.Group as={Col} controlId="formGridEmail">
                            <Form.Label>Email</Form.Label>
                            <Form.Control
                                required
                                type="email"
                                placeholder="Enter email"
                                name={"email"}
                                value={this.state.email}
                                onChange={this.profileChange}
                            />
                        </Form.Group>

                        <Form.Group as={Col} controlId="formGridUsername">
                            <Form.Label>Username</Form.Label>
                            <Form.Control
                                requierd
                                name={"username"}
                                value={this.state.username}
                                onChange={this.profileChange}
                                type="username"
                                placeholder="Username" />
                        </Form.Group>
                    </Form.Row>

                    <Form.Row>
                    <Form.Group as={Col} controlId="formGridFirstName">
                        <Form.Label>FirstName</Form.Label>
                        <Form.Control
                            required
                            name={"firstName"}
                            value={this.state.firstName}
                            onChange={this.profileChange}
                            placeholder="FirstName" />
                    </Form.Group>

                    <Form.Group as={Col} controlId="formGridLastName">
                        <Form.Label>LastNAme</Form.Label>
                        <Form.Control
                            required
                            placeholder="LastName"
                            name={"secondName"}
                            value={this.state.secondName}
                            onChange={this.profileChange}/>
                    </Form.Group>
                    </Form.Row>

                    <Form.Row>
                        <Form.Group as={Col} controlId="formGridCity">
                            <Form.Label>City</Form.Label>
                            <Form.Control
                                required
                                name={"city"}
                                value={this.state.city}
                                onChange={this.profileChange}
                            />
                        </Form.Group>

                        <Form.Group as={Col} controlId="formGridState">
                            <Form.Label>State</Form.Label>
                            <Form.Control
                                name={"tara"}
                                value={this.state.tara}
                                onChange={this.profileChange}
                                as="select" defaultValue="Choose...">
                                <option>Austria</option>
                                <option>Italy</option>
                                <option>Belgium</option>
                                <option>Latvia</option>
                                <option>Bulgaria</option>
                                <option>Lithuania</option>
                                <option>Croatia</option>
                                <option>Luxembourg</option>
                                <option>Cyprus</option>
                                <option>Malta</option>
                                <option>Czechia</option>
                                <option>Netherlands</option>
                                <option>Denmark</option>
                                <option>Poland</option>
                                <option>Estonia</option>
                                <option>Portugal</option>
                                <option>Finland</option>
                                <option>Romania</option>
                                <option>France</option>
                                <option>Slovakia</option>
                                <option>Germany</option>
                                <option>Slovenia</option>
                                <option>Greece</option>
                                <option>Spain</option>
                                <option>Hungary</option>
                                <option>Sweden</option>
                                <option>Ireland</option>
                            </Form.Control>
                        </Form.Group>

                        <Form.Group as={Col} controlId="formGridZip">
                            <Form.Label>Zip</Form.Label>
                            <Form.Control
                                name={"zip"}
                                value={this.state.zip}
                                onChange={this.profileChange}/>
                        </Form.Group>
                    </Form.Row>

                    <Button className={"bg-dark text white"} variant="primary" type="submit">
                        Edit
                    </Button>
                </Form>
            </Card.Body>
        </Card>)
    }
}
export default Profile